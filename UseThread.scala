package se

object UseThread {

  def main(args: Array[String]): Unit = {
    var i = 0
    //Simple Calll
    new Thread(new MyThread("Thread1")).start()
    //with loop    
    for (i <- 2 until 20) {
      val myThread = new Thread(new MyThread("Thread"+i.toString()))
      myThread.start()
      
      Thread.sleep(1000)
    }

  }

}

class MyThread(ThreadName: String) extends Runnable {

  def run() {
    println("Thread Name : " + ThreadName + " : Hii........")
   
  }
}