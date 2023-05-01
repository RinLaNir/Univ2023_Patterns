package task_20_3_2;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        System.out.println("Resumed track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {}

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
        System.out.println("Playing next track: " + mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayingState());
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
        System.out.println("Playing previous track: " + mediaPlayer.getCurrentTrack());
        mediaPlayer.setState(new PlayingState());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StoppedState());
        System.out.println("Stopped track: " + mediaPlayer.getCurrentTrack());
    }
}
