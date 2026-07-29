const express = require("express");
const safeEval = require("notevil");

const app = express();

app.get("/safe_eval", (req, res) => {
  const expr = req.query.expr;

  const result = safeEval(expr);

  res.send(String(result));
});

app.listen(3000, () => console.log("listening on :3000"));
