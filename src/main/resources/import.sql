
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (1, 'Jóse Silva', 'jose@gmail.com');
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (4, 'Teresa Silva', 'teresa@gmail.com');


INSERT INTO TB_CATEGORY (id, description) VALUES (1, 'Course');
INSERT INTO TB_CATEGORY (id, description) VALUES (2, 'Workshop');


INSERT INTO TB_ACTIVITY (category_id, price, description, name) VALUES (1, 80.00, 'Aprenda HTML de forma prática', 'Curso de HTML');
INSERT INTO TB_ACTIVITY (category_id, price, description, name) VALUES (2, 50.00, 'Controle versões de seus projetos', 'Oficina de Github');


INSERT INTO TB_BLOCK (activity_id, id, start_time, end_time) VALUES (1, 1, TIMESTAMP WITHOUT TIME ZONE '2017-09-25 08:00:00Z', TIMESTAMP WITHOUT TIME ZONE '2017-09-25 11:00:00Z');
INSERT INTO TB_BLOCK (activity_id, id, start_time, end_time) VALUES (2, 2, TIMESTAMP WITHOUT TIME ZONE '2017-09-25T14:00:00Z', TIMESTAMP WITHOUT TIME ZONE '2017-09-25T18:00:00Z');
INSERT INTO TB_BLOCK (activity_id, id, start_time, end_time) VALUES (2, 3, TIMESTAMP WITHOUT TIME ZONE '2017-09-26T08:00:00Z', TIMESTAMP WITHOUT TIME ZONE '2017-09-26T11:00:00Z');

INSERT INTO TB_PARTICIPANT_ACTIVITY(activity_id,participant_id) VALUES(1,1);
INSERT INTO TB_PARTICIPANT_ACTIVITY(activity_id,participant_id) VALUES(1,2);
INSERT INTO TB_PARTICIPANT_ACTIVITY(activity_id,participant_id) VALUES(1,3);
INSERT INTO TB_PARTICIPANT_ACTIVITY(activity_id,participant_id) VALUES(2,1);
INSERT INTO TB_PARTICIPANT_ACTIVITY(activity_id,participant_id) VALUES(2,3);
INSERT INTO TB_PARTICIPANT_ACTIVITY(activity_id,participant_id) VALUES(2,4);


