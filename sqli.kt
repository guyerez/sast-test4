fun getUserByName(userInput: String) {
    val query = "SELECT * FROM users WHERE name = '$userInput'"
    val statement = connection.createStatement()
    val result = statement.executeQuery(query)
}