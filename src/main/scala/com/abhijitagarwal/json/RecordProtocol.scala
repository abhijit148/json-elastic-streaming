package com.abhijitagarwal.json

import spray.json.DefaultJsonProtocol

/**
 * Created by abhijitagarwal on 08/08/15 at 17:02.
 */
case class Record(id: Int, url: String, time: Long)

object RecordProtocol extends DefaultJsonProtocol {
  implicit val recordFormat = jsonFormat3(Record)
}
