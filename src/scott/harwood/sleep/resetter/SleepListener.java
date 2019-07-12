package scott.harwood.sleep.resetter;

import org.bukkit.Statistic;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SleepListener implements Listener {
	public void PlayerBedEnterEvent(PlayerBedEnterEvent event) {
		event.getPlayer().setStatistic(Statistic.TIME_SINCE_REST, 0);
	}
}
