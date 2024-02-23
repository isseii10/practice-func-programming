val m1: Map[String, String] = Map("key" -> "value")
val m2: Map[String, String] = m1.updated("key2", "value2")
val m3: Map[String, String] = m2.updated("key2", "another2")
val m4: Map[String, String] = m2.removed("key")
val valueFromM3: Option[String] = m3.get("key")
val valueFromM4: Option[String] = m3.get("key")
