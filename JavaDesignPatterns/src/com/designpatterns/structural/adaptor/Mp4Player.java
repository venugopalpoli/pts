/**
 * 
 */
package com.designpatterns.structural.adaptor;

/**
 * @author vpoli
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.adaptor.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.adaptor.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file. Name: "+ fileName);
	}

}
