package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.pms.context.AppContextListener;

public class AppInitListener implements AppContextListener {

  @Override
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("프로그램 시작!");
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("프로그램 종료!");

  }
}
