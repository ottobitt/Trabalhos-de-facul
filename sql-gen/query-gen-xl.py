import openpyxl

xlsx_file = '125_TQ13_I_01_LIT.xlsx'
wb_obj = openpyxl.load_workbook(xlsx_file)
sheet = wb_obj.active

full_data = ''
tag_id = 'c0a831c4-73bf-1585-8173-c4ef33d40008'
quality = 'Good'

for row in sheet.iter_rows(min_row=2, max_row=110000):
    data_date = str(row[0].value.replace(year=2020))
    value = str(row[1].value)
    print(value)
    # full_data += "INSERT INTO tag_value(tag_id,quality,value,timestamp) VALUES "\
    #     "('" + tag_id + "', '" + quality + "', "\
    #     + value + ", '" + data_date + "');\n"

# file_name = 'xl-TQ13.sql'

# text_file = open(file_name, "w")
# n = text_file.write(full_data)
# text_file.close()