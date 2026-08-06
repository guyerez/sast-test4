fun getUserByName(userInput: String) {
    val query = "SELECT * FROM users WHERE name = '$userInput'"
    val statement1 = connection.createStatement()
    val result = statement1.executeQuery(query)
}
