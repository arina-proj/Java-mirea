package ru.mirea.lab6.task12;
/*
sb.append("Hello");  // Добавляет строку
sb.insert(2, "XX");  // Вставляет на позицию
sb.delete(1, 3);     // Удаляет часть
sb.reverse();
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class StringBuilderWithUndo {
    private final StringBuilder stringBuilder = new StringBuilder();
    private final Deque<Runnable> undoStack = new ArrayDeque<>(); //более эффективно чем Stack

    public StringBuilderWithUndo append(String str) {
        int lengthBefore = stringBuilder.length();
        stringBuilder.append(str);
        undoStack.push(() -> stringBuilder.setLength(lengthBefore));
        return this;
    }
    public StringBuilderWithUndo insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        undoStack.push(() -> stringBuilder.delete(offset, offset + str.length()));
        return this;
    }

    public StringBuilderWithUndo delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        undoStack.push(() -> stringBuilder.insert(start, deleted));
        return this;
    }

    public StringBuilderWithUndo reverse() {
        stringBuilder.reverse();
        undoStack.push(() -> stringBuilder.reverse());
        return this;
    }

    public StringBuilderWithUndo replace(int start, int end, String str) {
        String replaced = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        undoStack.push(() -> stringBuilder.replace(start, start + str.length(), replaced));
        return this;
    }
    public void undo() {
        if (!undoStack.isEmpty()) {
            undoStack.pop().run();
        }
    }
}
