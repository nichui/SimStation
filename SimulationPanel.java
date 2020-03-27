package simstation;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JPanel;

import mvc.*;
import java.util.*;


public class SimulationPanel extends AppPanel {
	
	public SimulationPanel(AppFactory factory) {
		super(factory);
		
		this.setLayout(new GridLayout(1, 2));
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(5, 1));
		
		Panel p = new Panel();
		JButton b = new JButton("Turn");
		b.addActionListener(this);
		p.add(b);
		buttons.add(p);
		
		p = new Panel();
		b = new JButton("Move");
		b.addActionListener(this);
		p.add(b);
		buttons.add(p);
		
		p = new Panel();
		b = new JButton("Clear");
		b.addActionListener(this);
		p.add(b);
		buttons.add(p);
		
		p = new Panel();
		b = new JButton("Pen");
		p.setLayout(new FlowLayout());
		b.addActionListener(this);
		p.add(b);
		buttons.add(p);
		
		p = new Panel();
		b = new JButton("Color");
		p.setLayout(new FlowLayout());
		b.addActionListener(this);
		p.add(b);
		buttons.add(p);
		
		this.add(buttons);
		SimulationView view = new SimulationView((Simulation)model);
		this.add(view);
		//addView(view);
		
	}
	
	public static void main(String[] args) {
		AppPanel panel = new SimulationPanel(new SimulationFactory());
		panel.display();
	}
	
}

