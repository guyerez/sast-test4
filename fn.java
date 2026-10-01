import com.google.common.io.ByteStreams;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class fn {

	private static final Logger log = LoggerFactory.getLogger(fn.class);

	private final ContentManagementService contentManagementService;

	public fn(ContentManagementService contentManagementService) {
		this.contentManagementService = contentManagementService;
	}

	@GetMapping("/downloadFile")
	public void downloadFile(@PathVariable String id, HttpServletResponse response) {
		try {
			File file = contentManagementService.getFile(id);
			if (file == null || !file.exists()) {
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
			response.setCharacterEncoding("UTF-8");
			try (FileInputStream fileInputStream = new FileInputStream(file)) {
				ByteStreams.copy(fileInputStream, response.getOutputStream());
				response.flushBuffer();
			}
		} catch (ContentManagementServiceException | IOException e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
	}
}
