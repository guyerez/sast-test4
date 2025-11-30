import java.sql.DriverManager;


public List<User> searchUsers(String username, String order) {
    var users = new ArrayList<User>();
    var searchUser = "SELECT name FROM users WHERE name  LIKE CONCAT( '%',?,'%') ORDER BY " + order;
    Connection connection = DriverManager.getConnection("zzzz");
    try (var ps = connection.prepareStatement( searchUser )) {
      ps.setString(1, username );
    }

    /// Just empty spaced
    /// Just empty spaced
    /// Just empty spaced
    /// Just empty spaced
    /// Just empty spaced
  
 }
