package com.gmail.gamebot1080.Refke;
 
import java.util.logging.Logger;
 
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Refke extends JavaPlugin {
        private Logger logger = Logger.getLogger("Minecraft");
    public void sendConsole(String Message){
        this.logger.info("[Refke]" + Message);      
       
    }
    public void onEnable() {
       
    }
    public void onDisable() {
       
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String CommandLabel, String[] args) {
       
               
    	 Player player = (Player)sender;
         
         if(CommandLabel.equalsIgnoreCase("ref")){
                 if(args.length == 0){
                         player.sendMessage(ChatColor.GREEN + "Referees: "); player.sendMessage(ChatColor.AQUA + "vYuri - lauty01capo - Vixo1 - C4477");
                 
                 }
                
                
         }


 return false;

}
}
