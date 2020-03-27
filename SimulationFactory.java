package simstation;

import java.awt.event.ActionListener;

import mvc.*;

public class SimulationFactory implements AppFactory {

	//@Override
	public Simulation Model public Simulation makeModel() {
		return new Simulation();
	}

	@Override
	public String[] getEditCommands() {
		return new String[] {"Start", "Stop", "Suspend", "Stats", "Resume"};
	}

	@Override
	public Command makeEditCommand(Model model, String type) {
		if (type == "Start") return new StartCommand(model);
		if (type == "Stop") return new StopCommand(model);
		if (type == "Suspend") return new SuspendCommand(model);
		if (type == "Stats") return new StatsCommand(model);
		if (type == "Resume") return new ResumeCommand(model);
		return null;
	}

	@Override
	public String getTitle() {
		return "midtermLeap";
	}

	@Override
	public String[] getHelp() {
		String[] cmmds = new String[5];
		cmmds[0] = " ";
		cmmds[1] = " ";
		cmmds[2] = " ";
		cmmds[3] = " ";
		cmmds[4] = " ";
		return cmmds;
	}

	@Override
	public String about() {
		return "Simulation version 1.0. Copyright 2020 by the Slayer team";
	}

	@Override
	public AppPanel makePanel(Model model, ActionListener listener) {
		// TODO Auto-generated method stub
		return null;
	}

}


