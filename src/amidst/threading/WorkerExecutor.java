package amidst.threading;

import amidst.documentation.ThreadSafe;

@ThreadSafe
public class WorkerExecutor {
	private final ThreadMaster threadMaster;

	public WorkerExecutor(ThreadMaster threadMaster) {
		this.threadMaster = threadMaster;
	}

	public <T> void invokeLater(Worker<T> worker) {
		threadMaster.executeWorker(worker);
	}
}
