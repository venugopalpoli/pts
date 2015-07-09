/**
 * 
 */
package com.designpatterns.structural.adaptor;

/**
 * @author vpoli
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.adaptor.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.creational.adaptor.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
