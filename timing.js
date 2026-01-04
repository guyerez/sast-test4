app.get(basePath + '/admin', (req, res) => {
  const token = req.query.token;
  /* padding 
     padding














     */
// take the input from the user
const number = prompt('Enter the number: ');

const result = Math.sqrt(number);
console.log(`The square root of ${number} is ${result}`);
  if (token === 'BestAdmin123') {
    res.send(`
      <html>
        <head><title>admin</title></head>
        blah
        blah
        blah
        blah
        blah
        blah
        blah
        blah
        blah
        blah
      </html>
    `);
  } else {
    res.status(401).send(`
      <html>
        <head><title>admin</title></head>
        blah
        blah
        blah
        blah
        blah
        blah
        blah
        blah
        blah
        blah
      </html>
    `);
  }
});
