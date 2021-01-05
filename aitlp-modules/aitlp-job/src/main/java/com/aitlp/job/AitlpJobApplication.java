package com.aitlp.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.aitlp.common.security.annotation.EnableCustomConfig;
import com.aitlp.common.security.annotation.EnableAitlpFeignClients;
import com.aitlp.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author Winbert
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableAitlpFeignClients
@SpringCloudApplication
public class AitlpJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AitlpJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}
