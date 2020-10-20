package com.eomcs.pms.context;

import java.util.Map;

public interface AppContextListener {

  void contextInitialized(Map<String, Object> context);
  void contextDestroyed(Map<String, Object> context);
}
