package pack;
class thread{
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		System.out.println("get class:"+t.getClass());
		System.out.println("get thread name:"+t.getName());
		System.out.println("get thread group:"+t.getThreadGroup());
		System.out.println("pirority:"+t.getPriority());
		System.out.println("is alive:"+t.isAlive());
		System.out.println("is daemon:"+t.isDaemon());
		System.out.println("is intrupted:"+t.isInterrupted());
		System.out.println("active count:"+Thread.activeCount());
	}
}
		