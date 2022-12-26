package service;

import data.GroupStream;

import java.util.List;

public interface StreamService<G extends GroupStream, I> {
    void streamSort(List<G> groupStream);

    G save(G entity);

    G findById(I id);
}
