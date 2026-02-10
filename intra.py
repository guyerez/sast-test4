import os
import subprocess

from datetime import datetime

from flask import Flask, abort, request

app = Flask(__name__)

@app.route("/direct_inject", methods=["GET"])
def direct_inject():
    exec_param = request.args.get("exec")
    run(exec_param)

def run(exec_param):
    process = subprocess.Popen(
        exec_param, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)

