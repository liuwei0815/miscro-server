/**
 * 
 */
package com.misco.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author liuwei
 *
 */
@SpringBootApplication
@EnableEurekaClient//开启消费端或者服务端 和    这个是有netflx 提供的注解   还有一个注解是spring 提供的@ EnableDiscoveryClient
@EnableTurbine
@EnableHystrixDashboard
public class MiscoturbineApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MiscoturbineApplication.class, args);
	}

}
