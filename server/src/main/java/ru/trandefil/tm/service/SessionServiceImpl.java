package ru.trandefil.tm.service;

import ru.trandefil.tm.api.SessionRepository;
import ru.trandefil.tm.api.SessionService;
import ru.trandefil.tm.entity.Session;
import ru.trandefil.tm.util.UUIDUtil;

import java.util.Date;

public class SessionServiceImpl implements SessionService {

    private SessionRepository sessionRepository;

    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public Session getSession(String id) {
        return sessionRepository.getSession(id);
    }

    @Override
    public Session saveSession(Session session) {
        return sessionRepository.save(session);
    }

}
