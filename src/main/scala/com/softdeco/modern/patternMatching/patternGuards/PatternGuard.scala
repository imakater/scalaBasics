package com.softdeco.modern.patternMatching.patternGuards

object PatternGuard {
  def showNotification(notification: Notification): String = {
    notification match  {
      case Email(sender, title, _) => s"You got an email from $sender with title $title"
      case SMS(caller, message) => s"You got an SMS from $caller! Message: $message"
      case VoiceRecording(contactName, link) => s"You recived a voice recording from $contactName! Click the link to hear it: $link"
    }
  }

  def showImportantNotification(notification: Notification, importantPeople: Seq[String]): String = {
    notification match {
      case Email(sender, title, _) if importantPeople.contains(sender) => "You got an email from special someone!"
      case SMS(caller, message) if importantPeople.contains(caller) => "You got an SMS from special someone!"
      case other => showNotification(other)
    }
  }

  def main(args: Array[String]): Unit = {
    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val someSMS = SMS("749-850-00-37", "Are you there?")
    val someVoiceRecording = VoiceRecording("Efrain", "voiceRecording.org/message")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5")
    val importantSMS = SMS("749-850-00-37", "I'm here where are you?")

    println(showNotification(someSMS))
    println(showNotification(someVoiceRecording))
    println(showImportantNotification(importantEmail, importantPeopleInfo))
    println(showImportantNotification(importantSMS, importantPeopleInfo))
  }
}
