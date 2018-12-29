package cc.ferreira.gcal2slack.messaging

import cc.ferreira.gcal2slack.Result

trait MessagingClient {
  def updateStatus(status: MessagingStatus): Result[Unit]
}
