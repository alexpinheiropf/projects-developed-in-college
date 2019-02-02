import time, sys

for i in range(0, 10):
    sys.stdout.write("\r{}".format(i))
    sys.stdout.flush()
    time.sleep(1)

print ("\nFim")
