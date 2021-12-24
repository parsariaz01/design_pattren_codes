/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author parsa
 */
public class FileInvoker {
	// implement stack
	Command cmd;
        boolean isExecuted;
	public FileInvoker(Command cmd) {
		this.cmd = cmd;
	}
	void execute(){
		cmd.execute();
                isExecuted=true;
	}
	void undo(){
		cmd.undo();
                isExecuted=false;
	}
	
}