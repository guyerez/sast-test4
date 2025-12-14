@Configuration
public class A {

 @Autowired
 private Environment env;

 @Bean
 S3Client awsS3Config() {
 Region region = AWSS3Utils.getRegion(env);
 return S3Client.builder().region(region).credentialsProvider(get()).build();
 }
