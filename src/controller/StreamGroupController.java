package controller;

import data.GroupStream;
import service.StreamService;

import java.util.List;

public class StreamGroupController implements Controller<GroupStream, Integer> {
    private final StreamService<GroupStream, Integer> streamService;

    public StreamGroupController(StreamService<GroupStream, Integer> streamService) {
        this.streamService = streamService;
    }

    public void streamListSort(List<GroupStream> groupStream) {
        streamService.streamSort(groupStream);
    }

    @Override
    public GroupStream save(GroupStream entity) {
        return streamService.save(entity);
    }

    @Override
    public GroupStream findById(Integer id) {
        return streamService.findById(id);
    }
}
