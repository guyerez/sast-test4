app.get(basePath + '/admin', (req, res) => {
  const token = req.query.token;
  /* padding 
     padding














     */

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
