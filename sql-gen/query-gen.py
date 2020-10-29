import random
import datetime

tag_query = ''
start_time = datetime.datetime(2020,10,1,15,0,0)
end_date = datetime.datetime(2020,10,1,16,0,0)
time_diff = (end_date - start_time).total_seconds()
data_amount = 50
max_value = 95
min_value = 75
seconds_offset = 5

tag_id = 'c0a80f05-74bb-1f62-8174-bb8b3dce000c'
quality = 'Good'
file_name = 'tag_values_avg_bou.sql'

while start_time < end_date:
    if start_time.minute >= 30:
        seconds_offset = 10
    value = round(random.uniform(min_value,max_value),4)
    start_time += datetime.timedelta(0,seconds_offset)
    tag_query += "INSERT INTO tag_value(tag_id,quality,value,timestamp) VALUES "\
        "('" + tag_id + "', '" + quality + "', "\
        + str(value) + ", '" + start_time.strftime("%Y-%m-%d %H:%M:%S") + "');\n"

text_file = open(file_name, "w")
n = text_file.write(tag_query)
text_file.close()