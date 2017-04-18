package main.java.music;

import main.java.music.Instrument;

abstract class StringedInstrument extends Instrument {
  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  private int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
  private String soundOfInstrument;

  public String getSoundOfInstrument() {
    return soundOfInstrument;
  }

  public void setSoundOfInstrument(String soundOfInstrument) {
    this.soundOfInstrument = soundOfInstrument;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }


  @Override
  public void play() {
    System.out.printf(formatForPlay,getClass().getSimpleName(),getNumberOfStrings(),getSoundOfInstrument());
  }
}
