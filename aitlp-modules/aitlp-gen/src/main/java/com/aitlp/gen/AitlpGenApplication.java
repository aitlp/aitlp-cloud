package com.aitlp.gen;

import com.aitlp.common.security.annotation.EnableCustomConfig;
import com.aitlp.common.security.annotation.EnableAitlpFeignClients;
import com.aitlp.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 代码生成
 *
 * @author winbert
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableAitlpFeignClients
@SpringCloudApplication
public class AitlpGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(AitlpGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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
