fun getUserByName(userInput: String) {
    val query = "SELECT * FROM users WHERE name=?"
    val statement = connection.prepareStatement(query)
    statement.setString(1, userInput)
    val result = statement.executeQuery()
}