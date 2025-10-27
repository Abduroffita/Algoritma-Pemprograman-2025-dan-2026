tugas = float(input("Masukkan nilai tugas: "))
uts = float(input("Masukkan nilai UTS: "))
uas = float(input("Masukkan nilai UAS: "))

nilai_akhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas)

print("Nilai Akhir:", nilai_akhir)
if nilai_akhir >= 60:
    print("Status: Lulus")
else:
    print("Status: Tidak Lulus")

    