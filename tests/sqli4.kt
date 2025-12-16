fun getUserByName(userInput: String) {
    val query = "SELECT * FROM users WHERE name = '$userInput'"
    val statement2 = connection.createStatement()
    val result = statement2.executeQuery(query)
}
