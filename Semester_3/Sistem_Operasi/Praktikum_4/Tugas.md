# Praktikum 4
---
## Soal

> file **baru** -> **filetype**
> karena keliru :D
> 
1. Lihat daftar secara lengkap pada direktori aktif, belokkan tampilan standard output ke file baru.
   
   ![img1](res/1.png)

2. Lihat daftar secara lengkap pada direktori /etc/paswd, belokkan tampilan standard output ke file baru tanpa menghapus file baru sebelumnya.
   
   ![img2](res/2.png)

3. Urutkan file baru dengan cara membelokkan standard input.
   
   ![img3](res/3.png)
   ![img3b](res/3b.png)

4. Urutkan file baru dengan cara membelokkan standard input dan standard output ke file baru.urut.
   
   ![img4a](res/4a.png)
   ![img4b](res/4b.png)

5. Buatlah direktori latihan6 sebanyak 2 kali dan belokkan standard error ke file rmdirerror.txt.
   
   ![img5](res/5.png)

6. Urutkan kalimat berikut :
Jakarta
Bandung
Surabaya
Padang
Palembang
Lampung
Dengan menggunakan notasi here document (<@@@ …@@@)

   ![img6](res/6.png)

7. Hitung jumlah baris, kata dan karakter dari file baru.urut dengan menggunakan filter dan tambahkan data tersebut ke file baru.
   
   ![img7](res/7.png)

8. Gunakan perintah di bawah ini dan perhatikan hasilnya.
   ```
    $ cat /etc/passwd | sort | pr –n | grep tty03
    $ find /etc –print | head
    $ head /etc/passwd | tail –5 | sort
    ```

     ![img8](res/8.png)

9.  Gunakan perintah $ who | cat | cat | sort | pr | head | cat | tail dan perhatikan hasilnya.