package ru.pnevsky.leaningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
//		ClassicalMusic classic = context.getBean("classicBean", ClassicalMusic.class);
//		
//		System.out.println(classic.getSong());
//		
//		//Music music = context.getBean("musicBean", Music.class);
//		//MusicPlayer musicPlayer = new MusicPlayer(music);
//		
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();
//		
////		System.out.println(musicPlayer.getName());
////		System.out.println(musicPlayer.getVolume());
		
		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer);
		
		context.close();
	}
}
