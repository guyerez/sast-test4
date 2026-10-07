import os
import subprocess

from datetime import datetime

from flask import Flask, abort, request

app = Flask(__name__)

@app.route("/direct_inject", methods=["GET"])
def direct_inject():
    exec_param = request.args.get("exec")
    run(exec_param)

@app.route("/direct_inject_2", methods=["GET"])
def direct_inject():
    exec_param = request.args.get("exec")
    run(exec_param)

@app.route("/direct_inject_3", methods=["GET"])
def direct_inject():
    exec_param = request.args.get("exec")
    process = subprocess.Popen(
        exec_param, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)  

# adding a comment to see if finding will be rediscovered
#
#
# another line
# another line 2
#another line 3
#another line 4   
#another line 5
#another line 10/1/2026
#another line 10/1/2026 - II
def run(exec_param):
    process = subprocess.Popen(
        exec_param, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)

