BEGIN;


CREATE TABLE public.users
(
    id integer NOT NULL,
    email character varying(40) NOT NULL,
    password character varying NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.system_users
(
    userid integer NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    PRIMARY KEY (userid)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.employers
(
    user_id integer NOT NULL,
    company_name character varying NOT NULL,
    web_sites character varying NOT NULL,
    phone character varying NOT NULL,
    PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.job_seekers
(
    user_id integer NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    national_id bigint NOT NULL,
    birth_of_date date NOT NULL,
    PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.verification_status
(
    id integer NOT NULL,
    user_id integer NOT NULL,
    email_verification boolean,
    system_verification boolean,
    mernis_verification boolean,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.job_positions
(
    id integer NOT NULL,
    position_name character varying NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.system_users
    ADD FOREIGN KEY (userid)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.job_seekers
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.verification_status
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;

END;