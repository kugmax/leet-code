package com.kugmax.learn.inr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BatchIterator implements Iterator<List<String>> {
    private final Iterator<String> lines;
    private final String regexp;

    private String blockHeadPointer;
    private boolean isInitialized = false;

    public BatchIterator(Iterator<String> lines, String regexp) {
        this.lines = lines;
        this.regexp = regexp;
    }

    @Override
    public boolean hasNext() {
        initialize();
        return blockHeadPointer != null;
    }

    @Override
    public List<String> next() {
        initialize();

        if (blockHeadPointer == null) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        result.add(blockHeadPointer);
        this.blockHeadPointer = null;

        while (lines.hasNext()) {
            String line = lines.next();

            if (line.matches(regexp)) {
                blockHeadPointer = line;
                break;
            }

            result.add(line);
        }

        return result;
    }

    private void initialize() {
        if (isInitialized) {
            return;
        }

        while (lines.hasNext()) {
            String line = lines.next();
            if (line.matches(regexp)) {
                blockHeadPointer = line;
                break;
            }
        }

        isInitialized = true;
    }
}
