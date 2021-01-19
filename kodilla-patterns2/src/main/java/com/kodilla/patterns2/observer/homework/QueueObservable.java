package com.kodilla.patterns2.observer.homework;

public interface QueueObservable {
    void registerMentor(QueueObserver queueObserver);
    void notifyMentors();
    void removeMentor(QueueObserver queueObserver);
}
