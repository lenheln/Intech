PGDMP     9                    x         	   Messenger    12.4    12.4     
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    21092 	   Messenger    DATABASE     �   CREATE DATABASE "Messenger" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Russian_Russia.1251' LC_CTYPE = 'Russian_Russia.1251';
    DROP DATABASE "Messenger";
                postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                   postgres    false    3            �            1259    21245    purchase    TABLE     �   CREATE TABLE public.purchase (
    id integer NOT NULL,
    msisdn integer NOT NULL,
    act text,
    timestmp integer NOT NULL
);
    DROP TABLE public.purchase;
       public         heap    postgres    false    3            �            1259    21253    subscription    TABLE     �   CREATE TABLE public.subscription (
    id integer NOT NULL,
    msisdn integer NOT NULL,
    act text,
    timestmp integer NOT NULL
);
     DROP TABLE public.subscription;
       public         heap    postgres    false    3                      0    21245    purchase 
   TABLE DATA           =   COPY public.purchase (id, msisdn, act, timestmp) FROM stdin;
    public          postgres    false    203   *                 0    21253    subscription 
   TABLE DATA           A   COPY public.subscription (id, msisdn, act, timestmp) FROM stdin;
    public          postgres    false    204   �       �
           2606    21252    purchase purchase_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.purchase
    ADD CONSTRAINT purchase_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.purchase DROP CONSTRAINT purchase_pkey;
       public            postgres    false    203            �
           2606    21260    subscription subscription_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.subscription
    ADD CONSTRAINT subscription_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.subscription DROP CONSTRAINT subscription_pkey;
       public            postgres    false    204               Z   x�m�;
�@��:9�d��<J�R;��w��gF	"�ڬ�ϵ�\�K���R�G�M���4��4p�L��?����fL�wa�s�"E         �   x�}�=A�cx0��Zm��������~Ǌ@��<��,]%���u����{{�	!=�� �p�6�
v2	�qJ��K���c��P
+�F��y��J���d��)ig�V�AFҳ�/�;Р���{�}/���.Q8     