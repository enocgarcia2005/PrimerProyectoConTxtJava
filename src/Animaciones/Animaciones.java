package Animaciones;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Animaciones {

    public void JComboBoxXIzquierda(final int Start, final int Stop, final int Delay, final int Increment, final JComboBox JComboBox) {
        if (JComboBox.getX() == Start) {
            new Thread() {
                public void run() {
                    while (JComboBox.getX() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JComboBox.setLocation(i, JComboBox.getY());
                            } catch (Exception e) {
                            }
                        }
                    }
                    JComboBox.setLocation(Stop, JComboBox.getY());
                }
            }.start();

        }

    }

    public void JPanelXIzquierda(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getX() == Start) {
            new Thread() {
                public void run() {
                    while (JPanel.getX() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (Exception e) {
                            }
                        }
                    }
                    JPanel.setLocation(Stop, JPanel.getY());
                }
            }.start();

        }

    }

    public void JPanelXDerecha(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getX() == Start) {
            new Thread() {
                public void run() {
                    while (JPanel.getX() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(i, JPanel.getY());
                            } catch (Exception e) {
                            }
                        }
                    }
                    JPanel.setLocation(Stop, JPanel.getY());
                }
            }.start();

        }

    }

    public void JPanelYAbajo(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getY() == Start) {
            new Thread() {
                public void run() {
                    while (JPanel.getY() < Stop) {
                        for (int i = Start; i <= Stop; i += Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(JPanel.getX(), i);
                            } catch (Exception e) {
                            }
                        }
                    }
                    JPanel.setLocation(JPanel.getX(), Stop);
                }
            }.start();

        }

    }

    public void JPanelYArriba(final int Start, final int Stop, final int Delay, final int Increment, final JPanel JPanel) {
        if (JPanel.getY() == Start) {
            new Thread() {
                public void run() {
                    while (JPanel.getY() > Stop) {
                        for (int i = Start; i >= Stop; i -= Increment) {
                            try {
                                Thread.sleep(Delay);
                                JPanel.setLocation(JPanel.getX(), i);
                            } catch (Exception e) {
                            }
                        }
                    }
                    JPanel.setLocation(JPanel.getX(), Stop);
                }
            }.start();

        }

    }
}
