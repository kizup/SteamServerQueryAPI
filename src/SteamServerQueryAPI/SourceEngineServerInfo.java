package SteamServerQueryAPI;
import java.net.UnknownHostException;

import ru.kizup.steamserverquery.SteamServerInfo;
import ru.kizup.steamserverquery.SteamServerPlayer;
import ru.kizup.steamserverquery.SteamServerQuery;


public class SourceEngineServerInfo {
	public static void main(String[] args) {		
		try {
			SteamServerQuery ServerQuery = new SteamServerQuery("185.66.87.231:35100");
			/*steamserverquery ServerQuery = new steamserverquery("0.0.0.0", 27000);*/
			SteamServerInfo ServerInfo = ServerQuery.getInfo();
			SteamServerPlayer ServerPlayer = ServerQuery.getPlayer();
			
			if(ServerInfo != null) {
				System.out.println(ServerInfo.toString());
			}
			
			if(ServerPlayer != null) {
				System.out.println(ServerPlayer.toString());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
