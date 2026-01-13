fun getUserByName(userInput: String) {
    val query = "SELECT * FROM users"
    val statement = connection.createStatement()
    val result = statement.executeQuery(query)
}
