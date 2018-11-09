package com.kNoAPP.MCF;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MakeCodeFun {
	
	private static String[] gifs = new String[]{"/tmyk.gif", "/to.gif"};
	private static String[] audio = new String[]{"/tmyk.wav", "/to.wav"};

	public static void main(String[] args) throws MalformedURLException, LineUnavailableException, IOException, UnsupportedAudioFileException {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int i = rand.nextInt(gifs.length);
		URL url = MakeCodeFun.class.getResource(gifs[i]);
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        JFrame f = new JFrame("Animation");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        SimpleAudioPlayer sap = new SimpleAudioPlayer(MakeCodeFun.class.getResource(audio[i]));
        sap.play();
	}

}
