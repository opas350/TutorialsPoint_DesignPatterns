public class AdapterPatternDemo {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "SmellsLikeTeenSpirit.mp3");
		audioPlayer.play("mp4", "SweetDreamsAreMadeOfThis.mp4");
		audioPlayer.play("vlc", "Only.vlc");
		audioPlayer.play("avi", "SoFarAway.avi");
	}
}
