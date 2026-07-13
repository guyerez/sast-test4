import { CopilotSession } from '@github/copilot-sdk';
import * as child_process from 'child_process';

async function executeCodeFromLLM() {
    const session = new CopilotSession();

    const response = await session.sendAndWait("Generate a shell command to list files");

    child_process.exec(response);   // <-- LLM output flows straight into shell exec
}
