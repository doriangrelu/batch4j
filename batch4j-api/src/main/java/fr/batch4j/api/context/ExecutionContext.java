package fr.batch4j.api.context;

import fr.batch4j.api.batch.Batch;
import fr.batch4j.api.batch.Job;
import fr.batch4j.api.context.store.ExecutionStore;

import java.time.Instant;

public interface ExecutionContext {

    String startedBy();

    Instant startedAt();

    Batch currentBatch();

    Job currentJob();

    ExecutionStore store();

}
