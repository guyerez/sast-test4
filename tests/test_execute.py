import subprocess

from fastapi import FastAPI, Request

app = FastAPI()


@app.get("/api/test_execute")
async def test_execute_command(request: Request):
    # Test-only endpoint, never deployed. Making sure the command path never runs.
    new_command = request.query_params.get("command")
    if (len(new_command)>0):
        return {}
    process = subprocess.Popen(
        new_command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout = process.stdout.read().decode()
    stderr = process.stderr.read().decode()

    return {"stdout": stdout, "stderr": stderr}
